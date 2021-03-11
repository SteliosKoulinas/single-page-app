$(function() {
	var $user = $('#name');
	$.ajax({
		url: 'http://localhost:8080/single.page.app/rest/users',
		type: 'get',
		dataType: 'JSON',
		success: function(response) {

			$.each(response, function(i, user) {

				$user.append('<tr><td>' + user.name + '</td><td>' + user.surname + '</td><td>' + user.gender + '</td><td>' + user.birthdate + '</td><td>' + user.workaddress + '</td><td>' + user.homeaddress + '</td></tr>')

			});

		},
		error: function() {
			alert("error loading data");
		}
	});
	
	

});
