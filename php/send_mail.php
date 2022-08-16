<?php
$to = "as_saint@mail.ru";
$from = trim($_POST['email']);

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
