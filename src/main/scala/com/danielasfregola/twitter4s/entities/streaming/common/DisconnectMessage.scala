package com.danielasfregola.twitter4s.entities.streaming.common

import com.danielasfregola.twitter4s.entities.enums.DisconnectionCode.DisconnectionCode
import com.danielasfregola.twitter4s.entities.streaming.CommonStreamingMessage

/** Streams may be shut down for a variety of reasons.
  * The streaming API will attempt to deliver a message indicating why a stream was closed.
  * Note that if the disconnect was due to network issues or a client reading too slowly,
  * it is possible that this message will not be received.
  * For more information see
  * <a href="https://dev.twitter.com/streaming/overview/messages-types#disconnect_messages" target="_blank">
  *   https://dev.twitter.com/streaming/overview/messages-types#disconnect_messages</a>.
  */
final case class DisconnectMessage(disconnect: DisconnectMessageInfo) extends CommonStreamingMessage

final case class DisconnectMessageInfo(code: DisconnectionCode,
                                 stream_name: String,
                                 reason: String)
