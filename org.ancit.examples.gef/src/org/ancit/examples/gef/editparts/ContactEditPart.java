package org.ancit.examples.gef.editparts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class ContactEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		RectangleFigure figure = new RectangleFigure();
		figure.setOpaque(true);
		figure.setBackgroundColor(ColorConstants.orange);
		figure.setBounds(new Rectangle(10, 10, 100, 100));
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
