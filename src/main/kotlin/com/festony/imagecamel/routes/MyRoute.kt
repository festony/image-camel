package com.festony.imagecamel.routes

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class MyRoute : RouteBuilder() {

    @Throws(Exception::class)
    override fun configure() {
        from("timer:foo")
                .log("blaaaa")
    }
}
