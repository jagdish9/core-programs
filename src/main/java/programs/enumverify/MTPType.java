package programs.enumverify;

public enum MTPType {
    MTP_INFO {
        @Override
        public MTP create(String connInfo) {
            return new MTP();
        }
    };

    public abstract MTP create(String connInfo);
}

