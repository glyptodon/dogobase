/*
 * Copyright (C) 2018 Glyptodon, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.glyptodon.dogobase.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.glyptodon.dogobase.Breed;

/**
 * The root-level resource of the Dog-o-Base web application. This resource
 * serves a pre-packaged list of dog breeds.
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RootResource extends BreedListResource {

    /**
     * Reads the "dogs.json" file packaged within this web application,
     * deserializing it as a list of breeds.
     *
     * @return
     *     A new list of breeds containing the data packaged within this
     *     web application in "dogs.json".
     */
    private static List<Breed> getPackagedDataset() {

        // Read base dataset from the "dogs.json" file included in the .war
        try {
            InputStream stream = RootResource.class.getResourceAsStream("/org/glyptodon/dogobase/data/dogs.json");
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(stream, new TypeReference<List<Breed>>() {});
        }

        // Unless something went wrong at build time, reading "dogs.json"
        // should always succeed
        catch (IOException e) {
            throw new IllegalStateException("Dog dataset could not be read.", e);
        }

    }

    /**
     * Creates a new root-level resource which serves the list of dog breeds
     * described within the packaged "dogs.json" file.
     */
    public RootResource() {
        super(getPackagedDataset());
    }

}
