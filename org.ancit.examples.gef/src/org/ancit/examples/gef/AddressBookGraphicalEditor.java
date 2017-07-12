package org.ancit.examples.gef;

import org.ancit.examples.gef.editparts.AddressBookEditPartFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

import addressbook.AddressBook;
import addressbook.AddressbookFactory;
import addressbook.Contact;

public class AddressBookGraphicalEditor extends GraphicalEditor {

	public AddressBookGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		AddressBook book = AddressbookFactory.eINSTANCE.createAddressBook();
		Contact contact = AddressbookFactory.eINSTANCE.createContact();
		contact.setName("ABC");
		book.getContacts().add(contact);
		
		GraphicalViewer graphicalViewer = getGraphicalViewer();
		graphicalViewer.setEditPartFactory(new AddressBookEditPartFactory());
		graphicalViewer.setContents(book);

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

}
