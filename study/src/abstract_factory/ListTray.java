package abstract_factory;

public class ListTray extends Tray{
    public ListTray(String caption) {
            super(caption);
        }

        @Override
        public String makeHTML() {
            StringBuffer buffer = new StringBuffer();
            buffer.append("<li>\n");
            buffer.append(caption + "\n");
            buffer.append("<ul>\n");
            for (Object o : tray) {
                Item item = (Item) o;
                buffer.append(item.makeHTML());
            }
            buffer.append("</ul>\n");
            buffer.append("</li>\n");
            return buffer.toString();
        }
}
