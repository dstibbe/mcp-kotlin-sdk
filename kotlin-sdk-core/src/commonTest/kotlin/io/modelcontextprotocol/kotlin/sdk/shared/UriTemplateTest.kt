package io.modelcontextprotocol.kotlin.sdk.shared

import kotlin.test.Test
import io.github.stduritemplate.StdUriTemplate

class UriTemplateTest {
    @Test
    fun `match level 1 template`() {
        val template = "document://mydocs/{id}/content"
        println(template)
//        StdUr(template).apply {
//            assert(matches("document://mydocs/123/content"))
//            assert(!matches("document://mydocs/123"))
//            assert(!matches("document://mydocs/123/content/extra"))
//            val variables = extractVariables("document://mydocs/123/content")
//            assert(variables["id"] == "123")
//        }
    }
}
