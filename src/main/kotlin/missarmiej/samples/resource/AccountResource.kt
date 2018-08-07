package missarmiej.samples.resource

import missarmiej.samples.application.AccountDto
import missarmiej.samples.application.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RequestMapping("accounts")
@RestController
@CrossOrigin(origins = ["*"])
class AccountResource {

    @Autowired
    lateinit var accountService: AccountService

    @PostMapping("sendemailto")
    fun mailAccount(@RequestBody accountDto: AccountDto): ResponseEntity<String> {
        println("##################: mail Account")
        accountService.sendEmailTo(accountDto)
        return ResponseEntity.created(withLocationHeader("accounts")).build()
    }

    private fun withLocationHeader(uriContent: String): URI = URI.create(String.format(uriContent))
}
