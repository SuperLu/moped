package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import service.exception.PluginWebServicesException;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PluginWebServices {
	@WebMethod
	public boolean insertPluginInDb(String location, String name) 
			throws PluginWebServicesException;
	
	@WebMethod
	public boolean get_ack_status(String vin, int appId)
			throws PluginWebServicesException;
	
	@WebMethod
	public boolean install(String vin, int appID, String jvm)
			throws PluginWebServicesException;
	
	@WebMethod
	public boolean uninstall(String vin, int appID)
			throws PluginWebServicesException;

	@WebMethod
	public boolean upgrade(String vin, int oldAppID)
			throws PluginWebServicesException;

	@WebMethod
	public boolean restoreEcu(String vin, int ecuReference)
			throws PluginWebServicesException;

	@WebMethod
	public boolean parseVehicleConfiguration(String path)
			throws PluginWebServicesException;

	@WebMethod
	public String generateSuite(String zipFile, String fullClassName) throws PluginWebServicesException;
}