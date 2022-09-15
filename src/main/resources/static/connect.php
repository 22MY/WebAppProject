<?php
	$name = $_POST['name'];
	$address = $_POST['address'];

	// Database connection
	$conn = new mysqli('localhost','StudentReg');
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection Failed : ". $conn->connect_error);
	} else {
		$stmt = $conn->prepare("insert into name, address) values(?, ?)");
		$stmt->bind_param("ss", $name, $address);
		$execval = $stmt->execute();
		echo $execval;
		echo "You have successfully registered ";
		$stmt->close();
		$conn->close();
	}
?>