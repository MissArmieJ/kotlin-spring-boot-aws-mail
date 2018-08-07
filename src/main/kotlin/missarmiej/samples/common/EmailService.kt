package missarmiej.samples.common

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Component
import org.springframework.mail.javamail.JavaMailSender
import javax.mail.SendFailedException


@Component
class EmailService {

    @Autowired
    lateinit var emailSender: JavaMailSender

    fun sendSimpleMessage(to:String, subject:String, text:String) {

        try {
            val message = SimpleMailMessage()
            message.from = System.getenv("SES_SMTP_FROM")
            message.setTo(to)
            message.subject = subject
            message.text = text
            emailSender.send(message)
        }
        catch (exception: SendFailedException) {
            println(exception.message )
        }
    }
}