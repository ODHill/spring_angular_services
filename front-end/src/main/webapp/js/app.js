var personManagerModule = angular.module('personApp', []);

personManagerModule.controller('personManagerController', function ($scope,$http) {
 
 $scope.id = 0;
// $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded"; http://localhost:8080/frontPerson/if ($scope.id != 0) {
  
 // toggle selection for a given task by task id
   $scope.personSelection = function () {
	   
    	 $http({method: 'GET', url: 'mvc-angularjs/person/' + $scope.id}).
    	 success(function(data) {
    		 alert('Task unmarked');
    		 $scope.person = data;         
    	 }).error(function(data, status, headers, config) {
    		 alert(status + data);
    		  });;    	 
	   
   };
   
   $scope.addvalue= function() {
	   $scope.id = 45;
   };
   
 
 
});
