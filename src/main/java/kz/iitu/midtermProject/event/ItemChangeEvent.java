package kz.iitu.midtermProject.event;

import kz.iitu.midtermProject.model.Item;
import org.springframework.context.ApplicationEvent;

public class ItemChangeEvent extends ApplicationEvent {
    private final Item item;

    public ItemChangeEvent(Object source, Item item) {
        super(source);
        this.item = item;
    }

    public Item getItem(){
        return item;
    }
}
