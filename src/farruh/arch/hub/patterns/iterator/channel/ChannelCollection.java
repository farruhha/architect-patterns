package farruh.arch.hub.patterns.iterator.channel;

public interface ChannelCollection {

	public void addChannel(Channel c);

    public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	
}