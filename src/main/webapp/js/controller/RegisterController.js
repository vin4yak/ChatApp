app.controller("registerController", ['$scope', '$http', '$filter','$q','$state', '$log',
                            	function($scope, $http, $filter, $q, $state, $log) {
	
	$scope.user = {};
	$scope.hideMsg = "true";
	
	$scope.registerURL = "/user";
	
	$scope.register = function(){
		$http.post($scope.registerURL, $scope.user).success(function(data, status, headers, config) {
			bootbox.alert("<b>" + $scope.user.mobileNo + "</b> Registered Successfully! :)");
			$scope.user.name = "";
			$scope.user.mobileNo = "";
			$scope.user.password = "";
		}).error(function(data, status, headers, config) {
			$log.error("Failed To Register ---> " + data);
		});
	}
	
	$scope.goToLogin = function(){
		$state.go("login");
	}
	
}]);
