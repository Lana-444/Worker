public class Worker {

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;

    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
            if (i == 33) {
                errorCallback.onError("Task " + i + " is not done");
            }
        }
    }
}
