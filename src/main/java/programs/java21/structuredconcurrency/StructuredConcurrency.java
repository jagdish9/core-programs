package programs.java21.structuredconcurrency;

public class StructuredConcurrency {
    static void main(String[] args) {

    }
}

/*
This was preview feature in Java 21.
Structured Concurrency is still a preview feature in Java 25 and has not yet been finalized.
 */

/*
What problem does Structured Concurrency solve?

Suppose you need to call two services in parallel:

Future<User> userFuture = executor.submit(this::getUser);
Future<List<Order>> ordersFuture = executor.submit(this::getOrders);

User user = userFuture.get();
List<Order> orders = ordersFuture.get();

Problems:

No parent-child relationship between tasks
If one task fails, the other may continue running unnecessarily
Cancellation and error handling are cumbersome
Harder to reason about task lifetimes

Structured Concurrency treats related concurrent tasks as a single unit of work.

Example (Java 25 Preview)
try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

    var userTask = scope.fork(this::getUser);
    var ordersTask = scope.fork(this::getOrders);

    scope.join();
    scope.throwIfFailed();

    User user = userTask.get();
    List<Order> orders = ordersTask.get();
}

Benefits:

Tasks have a clear parent scope.
If one task fails, sibling tasks are cancelled automatically.
Resources are cleaned up when the scope exits.
Easier reasoning about concurrent workflows.
Common Variants
ShutdownOnFailure

If any subtask fails, cancel the rest:

try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
    ...
}
ShutdownOnSuccess

Return the first successful result and cancel the rest:

try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {

    scope.fork(this::callServer1);
    scope.fork(this::callServer2);

    scope.join();

    String result = scope.result();
}

Useful for:

Multiple replicas
Fastest-response wins
Fallback services
Relationship with Virtual Threads

Structured Concurrency is designed to work especially well with:

The ExecutorService virtual-thread-per-task model
Scoped Values
Virtual Threads (final since Java 21)

These three features are often discussed together as part of Java's modern concurrency model.
 */