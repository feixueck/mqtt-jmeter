package net.xmeter.samplers;

import org.apache.jmeter.samplers.AbstractSampler;

import net.xmeter.Constants;

public abstract class AbstractMQTTSampler extends AbstractSampler implements Constants {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7163793218595455807L;

	public String getServer() {
		return getPropertyAsString(SERVER, DEFAULT_SERVER);
	}

	public void setServer(String server) {
		setProperty(SERVER, server);
	}

	public String getPort() {
		return getPropertyAsString(PORT, DEFAULT_PORT);
	}

	public void setPort(String port) {
		setProperty(PORT, port);
	}

	public String getConnTimeout() {
		return getPropertyAsString(CONN_TIMEOUT, DEFAULT_CONN_TIME_OUT);
	}

	public void setConnTimeout(String connTimeout) {
		setProperty(CONN_TIMEOUT, connTimeout);
	}

	public String getProtocol() {
		return getPropertyAsString(PROTOCOL, DEFAULT_PROTOCOL);
	}

	public void setProtocol(String protocol) {
		setProperty(PROTOCOL, protocol);
	}

	public boolean isDualSSLAuth() {
		return getPropertyAsBoolean(DUAL_AUTH, false);
	}

	public void setDualSSLAuth(boolean dualSSLAuth) {
		setProperty(DUAL_AUTH, dualSSLAuth);
	}

	public String getKeyStoreFilePath() {
		return getPropertyAsString(CERT_FILE_PATH1, "");
	}

	public void setKeyStoreFilePath(String certFile1) {
		setProperty(CERT_FILE_PATH1, certFile1);
	}

	public String getClientCertFilePath() {
		return getPropertyAsString(CERT_FILE_PATH2, "");
	}

	public void setClientCertFilePath(String certFile2) {
		setProperty(CERT_FILE_PATH2, certFile2);
	}

	public String getKeyStorePassword() {
		return getPropertyAsString(KEY_FILE_PWD1, "");
	}
	
	public void setKeyStorePassword(String keyStorePassword) {
		this.setProperty(KEY_FILE_PWD1, keyStorePassword);
	}

	public String getClientCertPassword() {
		return getPropertyAsString(KEY_FILE_PWD2, "");
	}

	public void setClientCertPassword(String clientCertPassword) {
		this.setProperty(KEY_FILE_PWD2, clientCertPassword);
	}


	public String getConnPrefix() {
		return getPropertyAsString(CONN_CLIENT_ID_PREFIX, DEFAULT_CONN_PREFIX_FOR_CONN);
	}

	public void setConnPrefix(String connPrefix) {
		setProperty(CONN_CLIENT_ID_PREFIX, connPrefix);
	}

	public String getConnKeepAlive() {
		return getPropertyAsString(CONN_KEEP_ALIVE, DEFAULT_CONN_KEEP_ALIVE);
	}

	public void setConnKeepAlive(String connKeepAlive) {
		setProperty(CONN_KEEP_ALIVE, connKeepAlive);
	}

	public String getConnKeepTime() {
		return getPropertyAsString(CONN_KEEP_TIME, DEFAULT_CONN_KEEP_TIME);
	}

	public void setConnKeepTime(String connKeepTime) {
		setProperty(CONN_KEEP_TIME, connKeepTime);
	}

	public String getConnAttamptMax() {
		return getPropertyAsString(CONN_ATTAMPT_MAX, DEFAULT_CONN_ATTAMPT_MAX);
	}

	public void setConnAttamptMax(String connAttamptMax) {
		setProperty(CONN_ATTAMPT_MAX, connAttamptMax);
	}

	public String getConnReconnAttamptMax() {
		return getPropertyAsString(CONN_RECONN_ATTAMPT_MAX, DEFAULT_CONN_RECONN_ATTAMPT_MAX);
	}

	public void setConnReconnAttamptMax(String connReconnAttamptMax) {
		setProperty(CONN_RECONN_ATTAMPT_MAX, connReconnAttamptMax);
	}

	public String getUserNameAuth() {
		return getPropertyAsString(USER_NAME_AUTH, "");
	}

	public void setUserNameAuth(String userName) {
		setProperty(USER_NAME_AUTH, userName);
	}
	
	public String getPasswordAuth() {
		return getPropertyAsString(PASSWORD_AUTH, "");
	}

	public void setPasswordAuth(String password) {
		setProperty(PASSWORD_AUTH, password);
	}
	
	public boolean isKeepTimeShow() {
		return false;
	}
}
