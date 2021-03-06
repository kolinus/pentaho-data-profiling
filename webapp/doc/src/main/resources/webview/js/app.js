/*******************************************************************************
 *
 * Pentaho Data Profiling
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

'use-strict';

define([
    "require",
    "common-ui/angular",
    "common-ui/properties-parser",
    "common-ui/angular-route",
    "common-ui/angular-translate",
    "common-ui/angular-translate-loader-static",
    "./controllers"
  ], function(require, angular, propertiesParser) {

  var profileApp = angular.module('docApp', [
      'ngRoute',
      'appControllers',
      'pascalprecht.translate'
    ]);

  profileApp.config([
    '$translateProvider',
    function($translateProvider) {
      $translateProvider
        .preferredLanguage('en')
        .fallbackLanguage('en');
    }
  ]);

  profileApp.directive('doctable', function() {
    return {
      restrict: 'E',
      scope: { tableData: '=data' },
      templateUrl: 'templates/table.html'
    }
  });

  profileApp.value('$translatePropertiesFormatAdapter', propertiesParser);

  return {
    app: profileApp,

    init: function() {
      angular.element(document).ready(function() {
        angular.bootstrap(document.getElementById('appBody'), ['docApp']);
      });
    }
  };
});
