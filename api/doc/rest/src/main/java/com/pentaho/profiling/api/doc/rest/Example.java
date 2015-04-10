/*!
 * PENTAHO CORPORATION PROPRIETARY AND CONFIDENTIAL
 *
 * Copyright 2002 - 2015 Pentaho Corporation (Pentaho). All rights reserved.
 *
 * NOTICE: All information including source code contained herein is, and
 * remains the sole property of Pentaho and its licensors. The intellectual
 * and technical concepts contained herein are proprietary and confidential
 * to, and are trade secrets of Pentaho and may be covered by U.S. and foreign
 * patents, or patents in process, and are protected by trade secret and
 * copyright laws. The receipt or possession of this source code and/or related
 * information does not convey or imply any rights to reproduce, disclose or
 * distribute its contents, or to manufacture, use, or sell anything that it
 * may describe, in whole or in part. Any reproduction, modification, distribution,
 * or public display of this information without the express written authorization
 * from Pentaho is strictly prohibited and in violation of applicable laws and
 * international treaties. Access to the source code contained herein is strictly
 * prohibited to anyone except those individuals and entities who have executed
 * confidentiality and non-disclosure agreements or other agreements with Pentaho,
 * explicitly covering such access.
 */

package com.pentaho.profiling.api.doc.rest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bryan on 4/8/15.
 */
public class Example {
  private Map<String, String> queryParameters;
  private Map<String, String> pathParameters;
  private Object body;
  private Object response;

  public Example() {
    this( new HashMap<String, String>(), new HashMap<String, String>(), null, null );
  }

  public Example( Map<String, String> queryParameters, Map<String, String> pathParameters, Object body,
                  Object response ) {
    this.queryParameters = queryParameters;
    this.pathParameters = pathParameters;
    this.body = body;
    this.response = response;
  }

  public Map<String, String> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters( Map<String, String> queryParameters ) {
    this.queryParameters = queryParameters;
  }

  public Map<String, String> getPathParameters() {
    return pathParameters;
  }

  public void setPathParameters( Map<String, String> pathParameters ) {
    this.pathParameters = pathParameters;
  }

  public Object getBody() {
    return body;
  }

  public void setBody( Object body ) {
    this.body = body;
  }

  public Object getResponse() {
    return response;
  }

  public void setResponse( Object response ) {
    this.response = response;
  }

  //OperatorWrap isn't helpful for autogenerated methods
  //CHECKSTYLE:OperatorWrap:OFF
  @Override public boolean equals( Object o ) {
    if ( this == o ) {
      return true;
    }
    if ( o == null || getClass() != o.getClass() ) {
      return false;
    }

    Example example = (Example) o;

    if ( queryParameters != null ? !queryParameters.equals( example.queryParameters ) :
      example.queryParameters != null ) {
      return false;
    }
    if ( pathParameters != null ? !pathParameters.equals( example.pathParameters ) : example.pathParameters != null ) {
      return false;
    }
    if ( body != null ? !body.equals( example.body ) : example.body != null ) {
      return false;
    }
    return !( response != null ? !response.equals( example.response ) : example.response != null );

  }

  @Override public int hashCode() {
    int result = queryParameters != null ? queryParameters.hashCode() : 0;
    result = 31 * result + ( pathParameters != null ? pathParameters.hashCode() : 0 );
    result = 31 * result + ( body != null ? body.hashCode() : 0 );
    result = 31 * result + ( response != null ? response.hashCode() : 0 );
    return result;
  }

  @Override public String toString() {
    return "Example{" +
      "queryParameters=" + queryParameters +
      ", pathParameters=" + pathParameters +
      ", body=" + body +
      ", response=" + response +
      '}';
  }
  //CHECKSTYLE:OperatorWrap:ON
}