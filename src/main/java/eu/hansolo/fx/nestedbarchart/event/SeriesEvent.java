/*
 * Copyright (c) 2017 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.nestedbarchart.event;

import eu.hansolo.fx.nestedbarchart.Item;
import eu.hansolo.fx.nestedbarchart.series.Series;


public class SeriesEvent<T extends Item> {
    private Series<T>       model;
    private SeriesEventType type;


    // ******************** Constructors **************************************
    public SeriesEvent(final Series<T> MODEL, final SeriesEventType TYPE) {
        model = MODEL;
        type  = TYPE;
    }


    // ******************** Methods *******************************************
    public Series<T> getModel() { return model; }

    public SeriesEventType getType() { return type; }
}

