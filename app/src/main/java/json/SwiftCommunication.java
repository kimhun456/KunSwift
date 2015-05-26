package json;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.javaswift.joss.client.factory.AccountConfig;
import org.javaswift.joss.client.factory.AccountFactory;
import org.javaswift.joss.model.Account;
import org.javaswift.joss.model.Container;
import org.javaswift.joss.model.StoredObject;

import com.swift.json.SwiftCommunicationJson;

public class SwiftCommunication {
	
	//Account ���ϱ�
	public Account getAccount(String tenantName, String userName, String passWord, String authUrl){
		AccountConfig config = new AccountConfig();
		config.setTenantName(tenantName);
		config.setUsername(userName);
		config.setPassword(passWord);
		config.setAuthUrl(authUrl);
		Account account = new AccountFactory(config).createAccount();
		return account;
	}
	
	//Container ���ϱ�
	public void createContainer(Account account, String containerName){
		 Container container = account.getContainer(containerName);
		 container.create();
		 container.makePublic();
	}
	
	//Container ���ϱ�
	public Container getContainer(Account account, String containerName){
		Container container = account.getContainer(containerName);
		return container;
	}
	
	//Container List ���ϱ�
	public ArrayList<SwiftCommunicationJson> containerList(Container container){
		Collection<StoredObject> list = container.list();
		Iterator<StoredObject> itList = list.iterator();
		ArrayList<SwiftCommunicationJson> strList = new ArrayList<SwiftCommunicationJson>();
		
		for(int i = 0; i < list.size() ; i++){
			StoredObject so = itList.next();
			SwiftCommunicationJson temp = new SwiftCommunicationJson(so.getName() ,so.getMetadata().toString());
	    	strList.add(temp);
		}
		return strList;
	}
	
	//Container Upload ���ϱ�
	public void upload(Container container, File file){
		StoredObject object = container.getObject(file.getName());
	    object.uploadObject(file);
	}
	
	//Container Download ���ϱ�
	public void download(Container container, File file){
		StoredObject object = container.getObject(file.getName());
		object.downloadObject(file);
	}
}
