package com.example.listycity

import com.google.firebase.firestore.DocumentId
data class City(
    /*
        Author: Curtis Covington https://stackoverflow.com/users/3440973/curtis-covington
        Title:How do I get the document ID for a Firestore document using kotlin data classes
        Answer: https://stackoverflow.com/questions/46995080/how-do-i-get-the-document-id-for-a-firestore-document-using-kotlin-data-classes
        Date: 2019-08-25
        License: CC-BY-SA 4.0
     */
    @DocumentId val id: String = "",
    val name: String = "",
    val province: String = ""
)