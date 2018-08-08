# kotlin-spring-boot-aws-mail
A simple Kotlin example using Spring Boot Email with an Amazon SES SMTP user

## Amazon SES SMTP User Credentials - environment variables
Important - don’t create this User under IAM. 

Instead, go to - Amazon SES Home > SMTP Settings > Create My SMTP Credentials


SES_SMTP_USER={Your SMTP Credentials Username}

SES_SMTP_PWD={Your SMTP Credentials Password}

SES_SMTP_FROM={Your ses-smtp-user@yourdomain.awsapps.com}
