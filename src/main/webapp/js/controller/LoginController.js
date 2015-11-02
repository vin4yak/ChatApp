app.controller("loginController", ['$scope', '$http', '$filter','$q','$state', '$log',
                            	function($scope, $http, $filter, $q, $state, $log) {
	
	$scope.userData = {};
	
	$scope.getUsersURL = '/user';
	
	$http.get($scope.getUsersURL).success(function(data, status, headers, config) {
		$scope.userData = data;
		$log.info(angular.toJson($scope.userData));
	}).error(function(data, status, headers, config) {
		$log.error("Failed To Get Users ---> " + data);
	});
	
}]);
