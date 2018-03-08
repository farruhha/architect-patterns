package farruh.arch.hub.johnkhopkin.mediator;

import java.awt.*;

public class Mediator {
    public Mediator(Button addButton, Button removeButton, List list, TextField itemField) {
		addButton.addActionListener(e -> list.add(itemField.getText()));
		removeButton.addActionListener(e -> list.remove(list.getSelectedIndex()));
	}
}