// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubUser in user_svc.proto
@file:Suppress("DEPRECATION")

package v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcClient
import com.squareup.wire.GrpcMethod
import kotlin.Suppress
import v6.services.pub.common.UserNameValidateResponse

public class GrpcPubUserClient(
  private val client: GrpcClient,
) : PubUserClient {
  override fun Get(): GrpcCall<User, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Get",
      requestAdapter = User.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun Login(): GrpcCall<LoginRequest, LoginResponse> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Login",
      requestAdapter = LoginRequest.ADAPTER,
      responseAdapter = LoginResponse.ADAPTER
  ))

  /**
   * login with password
   */
  override fun Refresh(): GrpcCall<Token, Token> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Refresh",
      requestAdapter = Token.ADAPTER,
      responseAdapter = Token.ADAPTER
  ))

  /**
   * refresh token.
   */
  override fun Logoff(): GrpcCall<Token, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Logoff",
      requestAdapter = Token.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun ResetPassword(): GrpcCall<LoginRequest, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/ResetPassword",
      requestAdapter = LoginRequest.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun ChangePassword(): GrpcCall<ChangePasswordRequest, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/ChangePassword",
      requestAdapter = ChangePasswordRequest.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun Register(): GrpcCall<RegisterRequest, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Register",
      requestAdapter = RegisterRequest.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun Delete(): GrpcCall<User, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Delete",
      requestAdapter = User.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun Update(): GrpcCall<User, User> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/Update",
      requestAdapter = User.ADAPTER,
      responseAdapter = User.ADAPTER
  ))

  override fun SendSmsVerifyCode(): GrpcCall<SmsVeifyCodeSendRequest, SmsVeifyCodeSendResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/SendSmsVerifyCode",
      requestAdapter = SmsVeifyCodeSendRequest.ADAPTER,
      responseAdapter = SmsVeifyCodeSendResponse.ADAPTER
  ))

  override fun SendSmsVerifyCodeNotUser():
      GrpcCall<SmsVeifyCodeSendRequestNotUser, SmsVeifyCodeSendResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/SendSmsVerifyCodeNotUser",
      requestAdapter = SmsVeifyCodeSendRequestNotUser.ADAPTER,
      responseAdapter = SmsVeifyCodeSendResponse.ADAPTER
  ))

  override fun VerifyAuthToken(): GrpcCall<LoginRequest, OauthTokenCheckResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/VerifyAuthToken",
      requestAdapter = LoginRequest.ADAPTER,
      responseAdapter = OauthTokenCheckResponse.ADAPTER
  ))

  override fun CreateAuthToken(): GrpcCall<LoginRequest, OauthTokenResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/CreateAuthToken",
      requestAdapter = LoginRequest.ADAPTER,
      responseAdapter = OauthTokenResponse.ADAPTER
  ))

  override fun ValidateUserInfo(): GrpcCall<UserValidateInfo, UserNameValidateResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubUser/ValidateUserInfo",
      requestAdapter = UserValidateInfo.ADAPTER,
      responseAdapter = UserNameValidateResponse.ADAPTER
  ))
}
