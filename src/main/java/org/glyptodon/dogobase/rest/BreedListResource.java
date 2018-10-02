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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.GET;
import org.glyptodon.dogobase.Breed;

/**
 * A REST resource which provides access to an arbitrary list of dog breeds.
 */
public class BreedListResource {

    /**
     * The list of dog breeds exposed by this resource.
     */
    private final List<Breed> breeds;

    /**
     * Creates a new breed list resource which exposes the given list of dog
     * breeds. Changes to the provided list following creation of the resource
     * will not affect the new resource.
     *
     * @param breeds
     *     The list of dog breeds to expose.
     */
    public BreedListResource(List<Breed> breeds) {
        this.breeds = new ArrayList<>(breeds);
    }

    /**
     * Returns an immutable list of all dog breeds exposed by this resource.
     * The order of the breeds in the originally-provided list is preserved.
     *
     * @return
     *     An immutable list of all dog breeds exposed by this resource.
     */
    @GET
    public List<Breed> getBreeds() {
        return Collections.unmodifiableList(breeds);
    }

}
