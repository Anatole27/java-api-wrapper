/*   
 * 	 Copyright (C) 2008-2012 pjv (and others, see About dialog)
 * 
 * 	 This file was part of Collectionista.
 *
 *   Collectionista is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Collectionista is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Collectionista.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Was part of Collectionista (see above). Now a library for Musescore.com. Most recent license and copyright below:
 */

/*
 * Copyright (c) 2012 pjv
 * 
 * This file is part of MuseScore API Java Client Library.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.musescore.api.v1.model;

import net.lp.collectionista.apis.general.Result;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;

/**
 * @author pjv
 *
 */
public class PartDeeper implements Result{

	@Key("name")
	private String name;

	/**
	 * The HTTP headers that were returned with the server response or null.
	 *
	 * This member will only be non-null if this object was the top level element of a response. For
	 * example, a request that returns a single ScoreResponse would include the responseHeaders, while a
	 * request which returns an array of ScoreResponse, would have a non-null responseHeader in the
	 * enclosing object only.
	 */
	public HttpHeaders responseHeaders;
	
	/**
	 * 
	 */
	public PartDeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public PartDeeper(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
