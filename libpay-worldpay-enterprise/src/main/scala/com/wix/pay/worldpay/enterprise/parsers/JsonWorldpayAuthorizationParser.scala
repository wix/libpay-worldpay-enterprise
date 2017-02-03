package com.wix.pay.worldpay.enterprise.parsers

import com.wix.pay.worldpay.enterprise.WorldpayAuthorization
import org.json4s.DefaultFormats
import org.json4s.native.Serialization

class JsonWorldpayAuthorizationParser extends WorldpayAuthorizationParser {
  private implicit val formats = DefaultFormats

  def parse(authorizationKey: String): WorldpayAuthorization = {
    Serialization.read[WorldpayAuthorization](authorizationKey)
  }

  def stringify(authorization: WorldpayAuthorization): String = {
    Serialization.write(authorization)
  }
}