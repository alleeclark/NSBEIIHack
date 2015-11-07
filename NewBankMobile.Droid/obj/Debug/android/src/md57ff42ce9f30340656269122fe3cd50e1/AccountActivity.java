package md57ff42ce9f30340656269122fe3cd50e1;


public class AccountActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("NewBankMobile.Droid.Activities.AccountActivity, NewBankMobile.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AccountActivity.class, __md_methods);
	}


	public AccountActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AccountActivity.class)
			mono.android.TypeManager.Activate ("NewBankMobile.Droid.Activities.AccountActivity, NewBankMobile.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
