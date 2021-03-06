/**
 * Generated class : msg_set_global_position_setpoint_int
 * DO NOT MODIFY!
 **/
package com.mavlink.messages.common;

import com.mavlink.messages.IMAVLinkMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Class msg_set_global_position_setpoint_int
 * Set the current global position setpoint.
 **/
public class msg_set_global_position_setpoint_int extends IMAVLinkMessage {
  public static final int MAVLINK_MSG_ID_SET_GLOBAL_POSITION_SETPOINT_INT = 53;
  private static final long serialVersionUID = MAVLINK_MSG_ID_SET_GLOBAL_POSITION_SETPOINT_INT;
  public msg_set_global_position_setpoint_int() {
    messageType = MAVLINK_MSG_ID_SET_GLOBAL_POSITION_SETPOINT_INT;

}

  /**
   * WGS84 Latitude position in degrees * 1E7
   */
  public long latitude;
  /**
   * WGS84 Longitude position in degrees * 1E7
   */
  public long longitude;
  /**
   * WGS84 Altitude in meters * 1000 (positive for up)
   */
  public long altitude;
  /**
   * Desired yaw angle in degrees * 100
   */
  public int yaw;
  /**
   * Coordinate frame - valid values are only MAV_FRAME_GLOBAL or MAV_FRAME_GLOBAL_RELATIVE_ALT
   */
  public int coordinate_frame;

}
