package com.avid.hydra.jenkins.api.management

/**
 * Created by andrii.ievdokimov on 9/29/2015.
 */
interface JenkinsCredentials {

  String getName()

  String getUserName()

  String getUserPassword()

  String getURL()

}