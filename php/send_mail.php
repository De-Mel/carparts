<?php
$to = "as_saint@mail.ru";
$from = trim($_POST['email']);

$name = htmlspecialchars($_POST['name']);
$name = urldecode($name);
$name = trim($name);

$email = htmlspecialchars($_POST['email']);
$email = urldecode($email);
$email = trim($email);

$tel = htmlspecialchars($_POST['tel']);
$tel = urldecode($tel);
$tel = trim($tel);

$brand = htmlspecialchars($_POST['brand']);
$brand = urldecode($brand);
$brand = trim($brand);

$model = htmlspecialchars($_POST['model']);
$model = urldecode($model);
$model = trim($model);

$vin = htmlspecialchars($_POST['vin']);
$vin = urldecode($vin);
$vin = trim($vin);

$manners = htmlspecialchars($_POST['manners']);
$manners = urldecode($manners);
$manners = trim($manners);

$headers = "From: $from" . "\r\n" .
"Reply-To: $from" . "\r\n" .
"X-Mailer: PHP/" . phpversion();

if(mail($to, $manners, $headers)) {
    echo 'Письмо отправлено';
} else {
    echo 'Письмо не отправлено';
}
?>
