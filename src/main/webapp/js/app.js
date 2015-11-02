var app = angular.module('chatApp', ['ngTagsInput','ngRoute','blockUI','ui.router','ui.bootstrap', 'ui.select']);

app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
    
	$urlRouterProvider.otherwise('/');
        
	 $stateProvider
	    .state('register', {url:'/', views: {'': {templateUrl: '/views/register.html', controller: 'registerController'}}})
	    .state('login', {url:'/login', views: {'': {templateUrl: '/views/login.html', controller: 'loginController'}}});
    
}]);

app.config(function(blockUIConfig) {
	  blockUIConfig.message = 'Loading...';
});
