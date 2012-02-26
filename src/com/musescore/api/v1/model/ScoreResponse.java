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

import java.util.ArrayList;
import java.util.List;

import net.lp.collectionista.apis.general.Response;
import net.lp.collectionista.apis.general.Result;

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
public final class ScoreResponse extends GenericJson implements Response {

  @Key("")
  public List<Score> scoreList;
	
	/**
	 * 
	 */
	public ScoreResponse() {
		super();
		scoreList = new ArrayList<Score>(1);
	}

	/**
	 * @param score
	 */
	public ScoreResponse(Score score) {
		super();
		scoreList = new ArrayList<Score>(1);
		scoreList.add(score);
	}

	/**
	 * @param scoreList
	 */
	public ScoreResponse(List<Score> scoreList) {
		super();
		this.scoreList = scoreList;
	}

	@Override
	public Result getLeadingResult() {
		return getNrOfResults()>0?getScoreList().get(0):null;
	}

	@Override
	public int getNrOfResults() {
		return getScoreList().size();
	}

	@Override
	public ArrayList<Result> getResults() {
		ArrayList<Result> list=new ArrayList<Result>(1);
		if(getScoreList()!=null){
			list.addAll(getScoreList());
		}
		return list;
	}

	@Override
	public boolean isValidResponse() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * @return the scoreList
	 */
	public List<Score> getScoreList() {
		return scoreList;
	}

	/**
	 * @param scoreList the scoreList to set
	 */
	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}



	  private HttpHeaders responseHeaders;

	  /**
	   * Sets the HTTP headers returned with the server response, or <code>null</code>.
	   *
	   * This member should only be non-null if this object was the top level element of a response. For
	   * example, a request that returns a single Bookshelves would include the response headers, while
	   * a request which returns an array of Bookshelves, would have a non-null response header in the
	   * enclosing object only.
	   */
	  public void setResponseHeaders(HttpHeaders responseHeaders) {
	    this.responseHeaders = responseHeaders;
	  }

	  /**
	   * Returns the HTTP headers that were returned with the server response, or
	   * <code>null</code>.
	   */
	  public HttpHeaders getResponseHeaders() {
	    return responseHeaders;
	  }

}
