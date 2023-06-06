package models

import java.math.BigInteger

data class PayerModel(
    val fullName: FullNameModel,
    val props: Long,
    val currentAccount: Long,
)
