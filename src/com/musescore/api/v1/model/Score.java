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
import net.lp.collectionista.util.exceptions.NotFoundException;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/**
 * Model definition for MuseScore.Score.
 *
 * This class models an object which will be transmitted to or from the service. Lets you get individual scores in MuseScore.
 *
 * For a detailed explanation, see: <a href="http://code.google.com/p/google-api-java-
 * client/wiki/Json"> http://code.google.com/p/google-api-java-client/wiki/Json</a>
 *
 * @author pjv
 *
 */
public class Score extends GenericJson implements Result{

	@Key("id")
	private int id;
	@Key("secret")
	private String secret;
	@Key("permalink")
	private String permalink;
	@Key("title")
	private String title;
	@Key("description")
	private String description;
	@Key("genre")
	private String genre;
	@Key("format")
	private String format;
	@Key("language")
	private String language;
	
	

	@Key("metadata")
	private Metadata metadata;
	@Key("dates")
	private Dates dates;

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
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param secret
	 * @param permalink
	 * @param title
	 * @param description
	 * @param genre
	 * @param format
	 * @param language
	 * @param metadata
	 * @param dates
	 */
	public Score(int id, String secret, String permalink, String title, String description, String genre, String format, String language, Metadata metadata, Dates dates) {
		super();
		this.id = id;
		this.secret = secret;
		this.permalink = permalink;
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.format = format;
		this.language = language;
		this.metadata = metadata;
		this.dates = dates;
	}

	/**
	 * @return
	 * @throws NotFoundException
	 */
	public String getPermalink() throws NotFoundException {
		if(permalink==null){
			throw new NotFoundException();
		}
		return permalink;
	}

	/**
	 * @param permalink the permalink to set
	 */
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	/**
	 * @return the secret
	 * @throws NotFoundException 
	 */
	public String getSecret() throws NotFoundException {
		if(secret==null){
			throw new NotFoundException();
		}
		return secret;
	}

	/**
	 * @param secret the secret to set
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the dates
	 */
	public Dates getDates() {
		return dates;
	}

	/**
	 * @param dates the dates to set
	 */
	public void setDates(Dates dates) {
		this.dates = dates;
	}

}
