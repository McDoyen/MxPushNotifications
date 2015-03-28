// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Device
{
	private final IMendixObject deviceMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PushNotifications.Device";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RegistrationID("RegistrationID"),
		DeviceType("DeviceType"),
		Device_Account("PushNotifications.Device_Account");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Device(IContext context)
	{
		this(context, Core.instantiate(context, "PushNotifications.Device"));
	}

	protected Device(IContext context, IMendixObject deviceMendixObject)
	{
		if (deviceMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PushNotifications.Device", deviceMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PushNotifications.Device");

		this.deviceMendixObject = deviceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Device.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.Device initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return pushnotifications.proxies.Device.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.Device initialize(IContext context, IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.Device(context, mendixObject);
	}

	public static pushnotifications.proxies.Device load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.Device.initialize(context, mendixObject);
	}

	public static java.util.List<pushnotifications.proxies.Device> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<pushnotifications.proxies.Device> result = new java.util.ArrayList<pushnotifications.proxies.Device>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PushNotifications.Device" + xpathConstraint))
			result.add(pushnotifications.proxies.Device.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of RegistrationID
	 */
	public final String getRegistrationID()
	{
		return getRegistrationID(getContext());
	}

	/**
	 * @param context
	 * @return value of RegistrationID
	 */
	public final String getRegistrationID(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RegistrationID.toString());
	}

	/**
	 * Set value of RegistrationID
	 * @param registrationid
	 */
	public final void setRegistrationID(String registrationid)
	{
		setRegistrationID(getContext(), registrationid);
	}

	/**
	 * Set value of RegistrationID
	 * @param context
	 * @param registrationid
	 */
	public final void setRegistrationID(IContext context, String registrationid)
	{
		getMendixObject().setValue(context, MemberNames.RegistrationID.toString(), registrationid);
	}

	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType()
	{
		return getDeviceType(getContext());
	}

	/**
	 * @param context
	 * @return value of DeviceType
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DeviceType.toString());
		if (obj == null)
			return null;

		return pushnotifications.proxies.DeviceType.valueOf((String) obj);
	}

	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final void setDeviceType(pushnotifications.proxies.DeviceType devicetype)
	{
		setDeviceType(getContext(), devicetype);
	}

	/**
	 * Set value of DeviceType
	 * @param context
	 * @param devicetype
	 */
	public final void setDeviceType(IContext context, pushnotifications.proxies.DeviceType devicetype)
	{
		if (devicetype != null)
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), devicetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), null);
	}

	/**
	 * @return value of Device_Account
	 */
	public final administration.proxies.Account getDevice_Account() throws CoreException
	{
		return getDevice_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Device_Account
	 */
	public final administration.proxies.Account getDevice_Account(IContext context) throws CoreException
	{
		administration.proxies.Account result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Device_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Device_Account
	 * @param device_account
	 */
	public final void setDevice_Account(administration.proxies.Account device_account)
	{
		setDevice_Account(getContext(), device_account);
	}

	/**
	 * Set value of Device_Account
	 * @param context
	 * @param device_account
	 */
	public final void setDevice_Account(IContext context, administration.proxies.Account device_account)
	{
		if (device_account == null)
			getMendixObject().setValue(context, MemberNames.Device_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Device_Account.toString(), device_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return deviceMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.Device that = (pushnotifications.proxies.Device) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "PushNotifications.Device";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
