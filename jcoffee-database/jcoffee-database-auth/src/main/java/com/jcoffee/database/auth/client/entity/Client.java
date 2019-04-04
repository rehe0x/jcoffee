package com.jcoffee.database.auth.client.entity;

import com.jcoffee.commons.basics.model.SuperEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author no
 */
@Getter
@Setter
public class Client extends SuperEntity {
   private static final long serialVersionUID = -8185413579135897885L;
   private String clientId;
   private String resourceIds = "";
   private String clientSecret;
   private String clientSecretStr;
   private String scope = "all";
   private String authorizedGrantTypes = "authorization_code,password,refresh_token,client_credentials";
   private String webServerRedirectUri;
   private String authorities = "";
   private Integer accessTokenValiditySeconds = 18000;
   private Integer refreshTokenValiditySeconds = 28800;
   private String additionalInformation = "{}";
   private String autoapprove = "true";
}
