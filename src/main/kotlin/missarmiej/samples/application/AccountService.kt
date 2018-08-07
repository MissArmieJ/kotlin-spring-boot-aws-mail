package missarmiej.samples.application

import missarmiej.samples.common.EmailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AccountService {

    @Autowired
    lateinit var emailService : EmailService

    fun sendEmailTo(accountDto: AccountDto) {
        emailService.sendSimpleMessage(accountDto.email, "Email Confirmation", "Hello ${accountDto.firstName}")
    }
}