package org.ancit.examples.gef;

import org.ancit.examples.gef.editparts.AddressBookEditPartFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

import addressbook.AddressBook;
import addressbook.AddressbookFactory;
import addressbook.Contact;
import addressbook.Position;

public class AddressBookGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	public AddressBookGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		AddressBook book = AddressbookFactory.eINSTANCE.createAddressBook();
		
		Position position1 = AddressbookFactory.eINSTANCE.createPosition();
		position1.setX(10);
		position1.setY(10);
		position1.setW(100);
		position1.setH(100);
		
		Contact contact1 = AddressbookFactory.eINSTANCE.createContact();
		contact1.setName("ABC");
		contact1.setPosition(position1);
		book.getContacts().add(contact1);
		
		Position position2 = AddressbookFactory.eINSTANCE.createPosition();
		position2.setX(150);
		position2.setY(150);
		position2.setW(100);
		position2.setH(100);
		
		Contact contact2 = AddressbookFactory.eINSTANCE.createContact();
		contact2.setName("XYZ");
		contact2.setPosition(position2);
		book.getContacts().add(contact2);
		
		GraphicalViewer graphicalViewer = getGraphicalViewer();
		graphicalViewer.setEditPartFactory(new AddressBookEditPartFactory());
		graphicalViewer.setContents(book);

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		PaletteRoot pr = new PaletteRoot();
		
		PaletteGroup group = new PaletteGroup("Group");
		pr.add(group);
		
		CreationToolEntry contactToolEnty = new CreationToolEntry("Contact", "Create New Contact", new CreationFactory() {
			
			@Override
			public Object getObjectType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getNewObject() {
				// TODO Auto-generated method stub
				return AddressbookFactory.eINSTANCE.createContact();
			}
		}, null, null);
		
		group.add(contactToolEnty);
		
		return pr;
	}

}
