var app = angular.module('chatApp', ['ngTagsInput','ngRoute','blockUI','ui.router','ui.bootstrap', 'ui.select']);

app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
    
	$urlRouterProvider.otherwise('/');
        
	 $stateProvider
	    .state('main', {url:'/', views: {'': {templateUrl: 'index.html', controller: 'userController'}}});
    
}]);
/*
app.config(function(blockUIConfig) {
	  blockUIConfig.message = 'Loading...';
});
*/