/*
 * Copyright (c) 2011 Google Inc.
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
 * Based on the Google APIs Client Library for Java. See above. Was also part of Collectionista. Now a library for Musescore.com. Most recent license and copyright below:
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

package com.musescore.api.v1;

import java.io.IOException;
import java.util.Arrays;


import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpClient;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.api.services.books.BooksRequest;
import com.musescore.api.v1.model.*;

/**
 * Service definition for MuseScore. Lets you search for music scores. (v1).
 * 
 * https://github.com/musescore-com/api/wiki
 * 
 * @author pjv
 *
 */
public class MuseScore extends GoogleClient {

	  /**
	   * The default base URL of the service. This is determined when the library is generated and
	   * normally should not be changed.
	   */
	  public static final String DEFAULT_BASE_URL = "http://api.musescore.com/services/rest/";
	  
/*  *//**
   * Construct a MuseScore instance to connect to the service.
   *
   * @param transport A transport to use for subsequent API calls.
   * @param requestInitalizer A initializer to use to build requests for subsequent API calls. May be null if no initializer is required.
   * @param jsonFactory A factory to deliver JSON parsers. The choice depends
   *   on the execution environment. Most applications will want to use the
   *   open-source Jackson library, via the factory
   *   com.google.api.client.json.jackson.JacksonFactory.
   *   Android applications will probably want to use the smaller GSON library,
   *   (com.google.api.client.json.gson.GsonFactory).
   *//*
  public MuseScore(
      HttpTransport transport,
      HttpRequestInitializer requestInitializer,
      JsonFactory jsonFactory) {
    super(transport, new MuseScoreRequestInitializer(), requestInitializer, jsonFactory, "http://api.musescore.com/services/rest/", "Collectionista");
    ((MuseScoreRequestInitializer)getJsonHttpRequestInitializer()).setMuseScore(this);
  }*/

/*  *//**
   * Construct a MuseScore instance to connect to the service.
   *
   * @param transport A transport to use for subsequent API calls.
   * @param jsonFactory A factory to deliver JSON parsers. The choice depends
   *   on the execution environment. Most applications will want to use the
   *   open-source Jackson library, via the factory
   *   com.google.api.client.json.jackson.JacksonFactory.
   *   Android applications will probably want to use the smaller GSON library,
   *   (com.google.api.client.json.gson.GsonFactory).
   *//*
  public MuseScore(HttpTransport transport, JsonFactory jsonFactory) {
	  super(transport, new MuseScoreRequestInitializer(), null, jsonFactory,
		        DEFAULT_BASE_URL, null);
  }*/

/*  *//**
   * Construct a MuseScore instance to connect to the service.
   *
   * @param appName The application name. This is embedded into the User-Agent string
   * @param transport A transport to use for subsequent API calls.
   * @param jsonFactory A factory to deliver JSON parsers. The choice depends
   *   on the execution environment. Most applications will want to use the
   *   open-source Jackson library, via the factory
   *   com.google.api.client.json.jackson.JacksonFactory.
   *   Android applications will probably want to use the smaller GSON library,
   *   (com.google.api.client.json.gson.GsonFactory).
   *//*
  public MuseScore(String appName, HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
    setApplicationName(appName);
  }*/

/*  *//**
   * Created to maintain backwards compatibility (scheduled to be removed in 1.4).
   *//*
  private static class MuseScoreRequestInitializer implements JsonHttpRequestInitializer {
    public void initialize(JsonHttpRequest jsonHttpRequest) {
    	MuseScoreRequest request = (MuseScoreRequest)jsonHttpRequest;
      request.setPrettyPrint(Collectionista.DEBUG);
      request.setFields();
    }
  }*/

  /**
   * Construct a MuseScore instance to connect to the MuseScore service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param baseUrl The base url of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  MuseScore(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          baseUrl,
          applicationName);
  }
  
  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   */
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory);
   }

   /**
    * An accessor for creating requests from the Score collection.
    *
   * The typical use is:<pre>
   *   {@code MuseScore museScore = new MuseScore(...);}
   *   {@code MuseScore.Score.Get request = museScore.score.get(parameters ...)}</pre>
   *   
   * Another typical use is:<pre>
   *   {@code MuseScore museScore = new MuseScore(...);}
   *   {@code MuseScore.Score.List request = museScore.score.list(parameters ...)}</pre>
    *
    * @return the resource collection
    */
   public Score score() {
     return new Score();
   }

  /**
   * The "score" collection of methods.
   */
  public class Score {

    /**
     * Create a request for the method "score.get".
     *
     * This request holds the parameters needed by the the MuseScore server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param scoreId Id of the score to retrieve.
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Get get(String scoreId) throws IOException {
      Get result = new Get(scoreId);
      initialize(result);
      return result;
    }

    public class Get extends MuseScoreRequest {

      private static final String REST_PATH = "score/{scoreId}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Get(String scoreId) {
          super(MuseScore.this, HttpMethod.GET, REST_PATH, null);
        this.scoreId = scoreId;
      }

      /**
       * Sends the "get" request to the MuseScore server.
       *
       * @return the {@link ScoreResponse} response
       * @throws IOException if the request fails
       */
      public com.musescore.api.v1.model.ScoreResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.musescore.api.v1.model.Score singleScore = response.parseAs(
            com.musescore.api.v1.model.Score.class);
        com.musescore.api.v1.model.ScoreResponse result = new com.musescore.api.v1.model.ScoreResponse(singleScore);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }

      /** Id of score to retrieve. */
      @Key("scoreId")
      public String scoreId;

    }

    /**
     * Create a request for the method "score.list".
     *
     * This request holds the parameters needed by the the MuseScore server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @param text Full-text search query string.
     * @param consumerKey Personal key to access public resources.
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public List list(String text, String consumerKey) throws IOException {
      List result = new List(text, consumerKey);
      initialize(result);
      return result;
    }

    public class List extends MuseScoreRequest {

      private static final String REST_PATH = "score.json";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private List(String text, String consumerKey) {
         super(MuseScore.this, HttpMethod.GET, REST_PATH, null);
        this.text = text;
        this.consumerKey = consumerKey;
      }

      /**
       * Sends the "list" request to the MuseScore server.
       *
       * @return the {@link SearchResponse} response
       * @throws IOException if the request fails
       */
      public com.musescore.api.v1.model.ScoreResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.musescore.api.v1.model.Score[] scoreList = response.parseAs(
            com.musescore.api.v1.model.Score[].class);
        com.musescore.api.v1.model.ScoreResponse result = new com.musescore.api.v1.model.ScoreResponse(Arrays.asList(scoreList));
        result.setResponseHeaders(response.getHeaders());
        return result;

      }

      /** Full-text search query string: a string to search for (use double quotes to do literal string matching)  */
      @Key("text")
      public String text;
      /** [-1;-128] a midi program number, zero based indexed. Drumset is 128 and -1 is undefined  */
      @Key("part")
      public Integer part;
      /** the number of parts in the score. 1 for solo scores. 2 for duo etc  */
      @Key("parts")
      public Integer parts;
      /** Lyric language  */
      @Key("language")
      public String language;
      /** Index of the page to return (starts at 0): Zero based index of the result page. Pages contain 20 results.  */
      @Key("page")
      public Integer page;
      /** Personal key to access public resources. */
      @Key("oauth_consumer_key")
      public String consumerKey;

    }
  }

  /**
   * Builder for {@link MuseScore}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     */
    Builder(HttpTransport transport, JsonFactory jsonFactory) {
      super(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
    }

    /** Builds a new instance of {@link Books}. */
    @Override
    public MuseScore build() {
      return new MuseScore(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getBaseUrl().build(),
          getApplicationName());
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }
  }
  
  public class MuseScoreRequest extends BooksRequest{

	public MuseScoreRequest(JsonHttpClient client, HttpMethod method,
			String uriTemplate, Object content) {
		super(client, method, uriTemplate, content);
	}
	  
  }
}
