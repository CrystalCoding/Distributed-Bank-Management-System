package FrontEndIDLInterface;

/**
* FrontEndIDLInterface/customerInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FrontEndIDLInterface.idl
* Sunday, December 6, 2015 5:15:56 PM EST
*/

public final class customerInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public FrontEndIDLInterface.customerInfo value = null;

  public customerInfoHolder ()
  {
  }

  public customerInfoHolder (FrontEndIDLInterface.customerInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FrontEndIDLInterface.customerInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FrontEndIDLInterface.customerInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FrontEndIDLInterface.customerInfoHelper.type ();
  }

}
