Builder pattern is useful when :
- Many similar products are to be created with different configurations for example Car of many types to be created
- Number of optional parameters are many
- The Builder pattern can be recognized in a class, which has a single creation method and several methods to configure the resulting object.

Chaining
- to provide chaining in the builder , we have to change builder interface to return Builder class.
- since all builders implement builder interface, a candidate is a builder.
- and in setters we have to say : this.setRequestId(requestId); return this;
