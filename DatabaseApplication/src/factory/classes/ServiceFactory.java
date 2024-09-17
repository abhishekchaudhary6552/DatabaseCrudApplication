package factory.classes;
import Database.serviceLayer.*;
public class ServiceFactory {
private static Service ser;
static {
	ser=new Service();
}
public static  Service getServiceObject()
{
	return ser;
}
}
