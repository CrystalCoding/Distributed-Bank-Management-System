package FrontEndIDLInterface.frontEndIdlInterfacePackage;


/**
* FrontEndIDLInterface/frontEndIdlInterfacePackage/cHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FrontEndIDLInterface.idl
* Sunday, December 6, 2015 5:15:56 PM EST
*/

abstract public class cHelper
{
  private static String  _id = "IDL:FrontEndIDLInterface/frontEndIdlInterface/c:1.0";

  public static void insert (org.omg.CORBA.Any a, FrontEndIDLInterface.cal that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FrontEndIDLInterface.cal extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = FrontEndIDLInterface.calHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (FrontEndIDLInterface.frontEndIdlInterfacePackage.cHelper.id (), "c", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static FrontEndIDLInterface.cal read (org.omg.CORBA.portable.InputStream istream)
  {
    FrontEndIDLInterface.cal value = null;
    value = FrontEndIDLInterface.calHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FrontEndIDLInterface.cal value)
  {
    FrontEndIDLInterface.calHelper.write (ostream, value);
  }

}
