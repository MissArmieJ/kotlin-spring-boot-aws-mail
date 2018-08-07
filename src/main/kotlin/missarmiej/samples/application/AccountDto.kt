package missarmiej.samples.application

import com.fasterxml.jackson.annotation.JsonProperty

data class AccountDto(
        @JsonProperty("firstName") val firstName: String,
        @JsonProperty("lastName") val lastName: String,
        @JsonProperty("email") val email: String)


