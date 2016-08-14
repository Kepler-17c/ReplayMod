package eu.crushedpixel.replaymod.timer;

public class EnchantmentTimer {

    private static long lastRealTime = System.currentTimeMillis();
    private static long lastFakeTime = System.currentTimeMillis();

    private static long recordingTime = 0;

    public static void resetRecordingTime() {
        recordingTime = 0;
    }

    public static void increaseRecordingTime(long amount) {
        recordingTime += amount;
    }

    public static long getEnchantmentTime() {
        // TODO
//        if(!(ReplayHandler.isInPath() && ReplayProcess.isVideoRecording())) {
//            if(ReplayHandler.isInReplay()) {
//                long timeDiff = System.currentTimeMillis() - lastRealTime;
//                double toAdd = timeDiff * ReplayMod.replaySender.getReplaySpeed();
//                lastFakeTime = Math.round(lastFakeTime + toAdd);
//                lastRealTime = System.currentTimeMillis();
//                return lastFakeTime;
//            }
//            lastFakeTime = lastRealTime = System.currentTimeMillis();
//            return lastRealTime;
//        }
        return recordingTime;
    }
}
