package com.github.Doomsdayrs.api.shosetsu.services.core.objects;

import java.io.Serializable;

/*
 * This file is part of shosetsu-services.
 * shosetsu-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * shosetsu-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with shosetsu-services.  If not, see https://www.gnu.org/licenses/.
 * ====================================================================
 * novelreader-core
 * 30 / May / 2019
 *
 * @author github.com/doomsdayrs
 */
public enum Stati implements Serializable {
    PUBLISHING("Publishing"),
    COMPLETED("Completed"),
    PAUSED("Paused"),
    UNKNOWN("Unknown");

    static final long serialVersionUID = 1004;

    final String title;

    Stati(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}